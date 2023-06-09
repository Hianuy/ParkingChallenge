data class Car(
    override var numberOfParkingSpaces: Int,
    override var occupiedParkingSpace: Int,
    override val numberOfVagancyOccuppiedVehicle: Int
) : Vehicle(numberOfParkingSpaces, occupiedParkingSpace, numberOfVagancyOccuppiedVehicle) {
    override fun numberOfSpacesRemaining(): Int {
        return super.numberOfSpacesRemaining()
    }
}
