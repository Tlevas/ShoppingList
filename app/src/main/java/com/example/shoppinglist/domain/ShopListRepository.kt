package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun getShopList() : LiveData<List<ShopItem>>

    suspend fun addItem(shopItem: ShopItem)

    suspend fun deleteItem(shopItem: ShopItem)

    suspend fun editItem(shopItem: ShopItem)

    suspend fun getShopItem(shopItemId: Int) : ShopItem

}