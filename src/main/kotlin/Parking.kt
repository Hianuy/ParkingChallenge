data class Parking(
    val car: Car,
    val motorcycle: Motorcycle,
    val van: Van

){
    fun numberOfParkingSlotThatRemain(): Int{
        return car.numberOfSpacesRemaining() + motorcycle.numberOfSpacesRemaining() + van.numberOfSpacesRemaining()
    }
    fun numberOfParkingSlot(): Int{
        return motorcycle.numberOfParkingSpaces + car.numberOfParkingSpaces + + van.numberOfParkingSpaces
    }
    fun isFullParkingSlot(): Boolean{
        return if (numberOfParkingSlotThatRemain() == 0 ){
            true
        }else{
            false
        }
    }
    fun isEmptyParkingSlot(): Boolean{
        return if (numberOfParkingSlot() - numberOfParkingSlotThatRemain() == 0){
             true
        }else{
             false
        }
    }

    fun isFullParkingSlotMotorcycle(): Boolean{
        return if (isFullParkingSlot()){
            true
        }else{
            false
        }
    }

    fun isFullParkingSlotVan(): Boolean {

        val numberOfSpacesThatFitVan = car.numberOfSpacesRemaining() / van.numberOfVagancyOccuppiedVehicle

        val numberTotalSpacesVan = numberOfSpacesThatFitVan + van.numberOfSpacesRemaining()
        return if (numberTotalSpacesVan == ZERO) {
            true
        } else {
            false
        }
    }

    fun isFullParkingSlotCar(): Boolean{
        val totalCarSpaces = car.numberOfSpacesRemaining() + van.numberOfSpacesRemaining()
        return if (totalCarSpaces == ZERO){
            true
        }else{
            false
        }
    }
    fun numberOfParkingSlotVanIsTake(vehicle: Vehicle): Int{
        return vehicle.occupiedParkingSpace
    }

    companion object{
        const val ZERO = 0
    }
}