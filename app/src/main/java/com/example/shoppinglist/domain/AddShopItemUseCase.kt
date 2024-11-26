package com.example.shoppinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addItem(shopItem: ShopItem){
        shopListRepository.addItem(shopItem)
    }
}