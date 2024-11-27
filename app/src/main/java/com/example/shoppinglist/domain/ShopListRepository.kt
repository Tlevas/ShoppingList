package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun getShopList() : LiveData<List<ShopItem>>

    fun addItem(shopItem: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int) : ShopItem

}