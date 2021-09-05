package com.abhishek.foody.data

import com.abhishek.foody.model.restaurant.Latlng
import com.abhishek.foody.model.restaurant.OperatingHours
import com.abhishek.foody.model.restaurant.Restaurant
import com.abhishek.foody.model.restaurant.Review
import com.abhishek.foody.model.restaurantmenu.Category
import com.abhishek.foody.model.restaurantmenu.Menu
import com.abhishek.foody.model.restaurantmenu.MenuItem

fun getRestaurants() : List<Restaurant> {
    val restaurants = arrayListOf<Restaurant>()

    restaurants.add(
        Restaurant(1,
        "Mission Chinese Food",
        "Manhattan",
        "1.jpg",
        "171 E Broadway, New York, NY 10002",
        "Asian, Chinese",
        Latlng(40.713829, -73.989667),
        OperatingHours("5:30 pm - 11:00 pm",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm")
//                    getReviews()
    )
    )
    restaurants.add(
        Restaurant(2,
        "Oyster Bay",
        "Manhattan",
        "1.jpg",
        "191 A Broadway, New York, NY 10002",
        "Asian, Chinese",
        Latlng(40.713829, -73.989667),
        OperatingHours("5:30 pm - 11:00 pm",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm")
//                getReviews()
    )
    )
    restaurants.add(
        Restaurant(3,
        "Cubz",
        "Lousiana",
        "1.jpg",
        "1 C Broadway, Lousiana, LA 10002",
        "Continental, Italian",
        Latlng(40.713829, -73.989667),
        OperatingHours("5:30 pm - 11:00 pm",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm")
//                getReviews()
    )
    )
    restaurants.add(
        Restaurant(4,
        "Pasito",
        "Lousiana",
        "1.jpg",
        "21 E Broadway, Lousiana, LA 10002",
        "Continental, Italian",
        Latlng(40.713829, -73.989667),
        OperatingHours("5:30 pm - 11:00 pm",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm")
//                getReviews()
    )
    )
    restaurants.add(
        Restaurant(5,
        "Fish Land",
        "California",
        "1.jpg",
        "1 Main, California, CA 10002",
        "Spanish, Japanese",
        Latlng(40.713829, -73.989667),
        OperatingHours("5:30 pm - 11:00 pm",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm")
//                getReviews()
    )
    )
    restaurants.add(
        Restaurant(6,
        "Tokyo Kitchen",
        "California",
        "1.jpg",
        "18 C Broadway, New York, NY 10002",
        "Spanish, Japanese",
        Latlng(40.713829, -73.989667),
        OperatingHours("5:30 pm - 11:00 pm",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
            "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm")
//                getReviews()
    )
    )
    return  restaurants
}

private fun getReviews(): List<Review> {
    val reviews = arrayListOf<Review>()
    reviews.add(
        Review(
            1,
            "Steve",
            "October 26, 2020",
            4,
            "Mission Chinese Food has grown up from its scrappy Orchard Street days into a big, two story restaurant equipped with a pizza oven, a prime rib cart, and a much broader menu. Yes, it still has all the hits — the kung pao pastrami, the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, two generous family-style set menus, and showstoppers like duck baked in clay. And you can still get a lot of food without breaking the bank."
        )
    )
    reviews.add(
        Review(
            1,
            "Morgan",
            "October 26, 2019",
            3,
            "Mission Chinese Food has grown up from its scrappy Orchard Street days into a big, two story restaurant equipped with a pizza oven, a prime rib cart, and a much broader menu. Yes, it still has all the hits — the kung pao pastrami, the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, two generous family-style set menus, and showstoppers like duck baked in clay. And you can still get a lot of food without breaking the bank."
        )
    )
    reviews.add(
        Review(
            1,
            "Jason",
            "January 26, 2018",
            5,
            "Mission Chinese Food has grown up from its scrappy Orchard Street days into a big, two story restaurant equipped with a pizza oven, a prime rib cart, and a much broader menu. Yes, it still has all the hits — the kung pao pastrami, the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, two generous family-style set menus, and showstoppers like duck baked in clay. And you can still get a lot of food without breaking the bank."
        )
    )
    return reviews
}

fun getMenu() : List<Menu> {
    val menu = arrayListOf<Menu>()
    menu.add(Menu(1, getCategories()))
    menu.add(Menu(2, getCategories()))
    menu.add(Menu(3, getCategories()))
    menu.add(Menu(4, getCategories()))
    menu.add(Menu(5, getCategories()))
    menu.add(Menu(6, getCategories()))
    return menu
}

fun getCategories(): ArrayList<Category> {
    val category =  arrayListOf<Category>()
    category.add(Category("26576", getMenuSoups(), "Soups"))
    category.add(Category("26577", getMenuStarters(), "Starters"))
    category.add(Category("26578", getMenuMainCourse(), "Main Course"))
    category.add(Category("26580", getMenuRice(), "Rice and Biryani"))
    return category
}

fun getMenuSoups(): ArrayList<MenuItem> {
    val menuItems = arrayListOf<MenuItem>()
    menuItems.add(
        MenuItem(
            "26576",
            "Sweet corn soup",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "140.00"
        )
    )
    menuItems.add(
        MenuItem(
            "26577",
            "Veg Manchow Soup",
            "Chicken Livers and Portuguese Roll",
            "120.00"
        )
    )
    menuItems.add(
        MenuItem(
            "26578",
            "Non Veg Hot and Sour Soup",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "160.00"
        )
    )
    return menuItems;
}

fun getMenuStarters(): ArrayList<MenuItem> {
    val menuItems = arrayListOf<MenuItem>()
    menuItems.add(
        MenuItem(
            "26578",
            "3 Chicken Wings",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "250.00"
        )
    )
    menuItems.add(
        MenuItem(
            "26577",
            "Chicken Livers and Portuguese Roll",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "350.00"
        )
    )
    menuItems.add(
        MenuItem(
            "26576",
            "Chicken Breast Kabab",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "250.00"
        )
    )
    menuItems.add(
        MenuItem(
            "34",
            "Chicken Tangdi Kabab",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "350.00"
        )
    )
    return menuItems
}

fun getMenuMainCourse(): ArrayList<MenuItem> {
    val menuItems = arrayListOf<MenuItem>()
    menuItems.add(
        MenuItem(
            "26576",
            "Chicken Masala",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "350.00"
        )
    )
    menuItems.add(
        MenuItem(
            "26577",
            "Butter Chicken",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "250.00"
        )
    )
    menuItems.add(
        MenuItem(
            "26577",
            "Kadhai Paneer",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "350.00"
        )
    )
    return menuItems;
}

fun getMenuRice(): ArrayList<MenuItem> {
    val menuItems = arrayListOf<MenuItem>()
    menuItems.add(
        MenuItem(
            "51",
            "Plain Rice",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "350.00"
        )
    )
    menuItems.add(
        MenuItem(
            "52",
            "Mutton Biryani",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "450.00"
        )
    )
    menuItems.add(
        MenuItem(
            "53",
            "Veg Biryani",
            "Tender, Spicy and Juicy. Original or Peri-Crusted",
            "350.00"
        )
    )
    return menuItems;
}