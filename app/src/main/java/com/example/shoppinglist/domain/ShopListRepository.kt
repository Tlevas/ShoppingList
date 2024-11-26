package com.example.shoppinglist.domain

interface ShopListRepository {

    fun getShopList() : List<ShopItem>

    fun addItem(shopItem: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int) : ShopItem

}