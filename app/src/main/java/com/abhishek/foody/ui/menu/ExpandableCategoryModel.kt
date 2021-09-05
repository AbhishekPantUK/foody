package com.abhishek.foody.ui.menu

import com.abhishek.foody.model.restaurantmenu.Category
import com.abhishek.foody.model.restaurantmenu.MenuItem

class ExpandableCategoryModel {
    companion object{
        const val PARENT = 1
        const val CHILD = 2
    }

    lateinit var categoryParent: Category
    var type : Int
    lateinit var menuChild : MenuItem
    var isExpanded : Boolean
    private var isCloseShown : Boolean

    constructor( type : Int, categoryParent: Category, isExpanded : Boolean = false,isCloseShown : Boolean = false ){
        this.type = type
        this.categoryParent = categoryParent
        this.isExpanded = isExpanded
        this.isCloseShown = isCloseShown

    }

    constructor(type : Int, menuChild : MenuItem, isExpanded : Boolean = false,isCloseShown : Boolean = false){
        this.type = type
        this.menuChild = menuChild
        this.isExpanded = isExpanded
        this.isCloseShown = isCloseShown


    }

}