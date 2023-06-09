fun main() {

    val motorcycle = Motorcycle(12, 12, numberOfVagancyOccuppiedVehicle = 1)
    val car = Car(numberOfParkingSpaces = 10,  occupiedParkingSpace = 1, numberOfVagancyOccuppiedVehicle = 1)
    val van = Van(6, 6, numberOfVagancyOccuppiedVehicle = 3)
    val parking = Parking(car = car , motorcycle = motorcycle, van = van)

    println("Vagas que sobraram: ${parking.numberOfParkingSlotThatRemain()}")
    println("Numero de vagas totais ${parking.numberOfParkingSlot()}")
    println("O estacionamento está cheio ? ${parking.isFullParkingSlot()}")
    println("o estacionamento está vázio ? ${parking.isEmptyParkingSlot()}")
    println("O estacionamento está com todas as vagas pra motos cheias?  ${parking.isFullParkingSlotMotorcycle()}")
    println("O estacionamento está com todas as vagas pra carro cheias ? ${parking.isFullParkingSlotCar()}")
    println("O estacionamento está com todas as vagas pra van cheias? ${parking.isFullParkingSlotVan()}")
    println("Quantas vagas as vans tomaram ${parking.numberOfParkingSlotVanIsTake(van)}")

}