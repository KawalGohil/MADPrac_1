class Car(
    private val type: String,
    private val model: Int,
    private val originalPrice: Double,
    private val owner: String,
    private val milesDriven: Int
) {
    // Initialize block for logging
    init {
        println("Object of class is created and Init is called.")
    }

    // Function to calculate the current car price based on miles driven
    fun getCurrentPrice(): Double {
        // Depreciates the car's price by 50 per mile
        return originalPrice - (milesDriven * 50.0)
    }

    // Function to get the original car price
    fun getOriginalPrice(): Double {
        return originalPrice
    }

    // Function to display the car information
    fun getCarInformation() {
        println("Car Information: $type, $model")
        println("Car Owner: $owner")
        println("Miles Driven: $milesDriven")
        println("Original Car Price: ${getOriginalPrice()}")
        println("Current Car Price: ${getCurrentPrice()}")
        println("---------")
    }
}

fun main() {
    // Creating individual car objects
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)
    car1.getCarInformation()

    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)
    car2.getCarInformation()

    // Creating an ArrayList of car objects
    println("******* ArrayList of Car *************")
    val carList = arrayListOf<Car>()

    val car3 = Car("Toyota", 2017, 1080000.0, "KJS", 100)
    carList.add(car3)

    val car4 = Car("Maruti", 2020, 4000000.0, "NPP", 200)
    carList.add(car4)

    // Displaying information for all cars in the ArrayList
    carList.forEach { it.getCarInformation() }
}
