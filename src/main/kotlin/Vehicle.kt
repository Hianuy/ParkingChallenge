abstract class Vehicle(
    open val numberOfParkingSpaces: Int,
    open val occupiedParkingSpace:Int,
    open val numberOfVagancyOccuppiedVehicle: Int
) {
    open fun numberOfSpacesRemaining(): Int{
        return numberOfParkingSpaces - occupiedParkingSpace
    }
}