package com.bacon.common.base

import com.bacon.common.resource.Resource
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentSnapshot
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await

abstract class BaseRepository {

    protected fun <T> doRequest(request: suspend () -> T) = flow {
        emit(Resource.Loading())
        emit(Resource.Success(data = request()))
    }.catch { message ->
        emit(
            Resource.Error(
                data = null, message = message.localizedMessage ?: "Error Occurred!"
            )
        )
    }

    suspend inline fun <reified T> fetchList(collection: CollectionReference) =
        collection.get().await().documents.mapNotNull { doc ->
            doc.toObject(T::class.java)
        }

    suspend fun addDocument(
        collection: CollectionReference,
        hashMap: HashMap<String, Any>,
        title: String? = null,
    ): Boolean {
        return try {
            if (title != null) {
                collection
                    .document(title)
                    .set(hashMap)
                    .await()
            } else {
                collection
                    .document()
                    .set(hashMap)
                    .await()
            }
            true
        } catch (e: Exception) {
            false
        }
    }

    suspend fun getDocument(collection: CollectionReference, id: String): DocumentSnapshot =
        collection
            .document(id)
            .get()
            .await()

}