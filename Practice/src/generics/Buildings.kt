package generics
open class BaseBuildingMaterial(open var numberNeeded:Int=1){}
class Wood : BaseBuildingMaterial(4){
    override fun toString(): String {
        return "Wood"
    }
}
class Brick : BaseBuildingMaterial(8){}

// generic class
class Building<T: BaseBuildingMaterial>(
    private val buildingMaterial: T,
    private val baseMaterialsNeeded:Int=100,
    val actualMaterialsNeeded:Int=buildingMaterial.numberNeeded+baseMaterialsNeeded){

    fun build(){
        print("$baseMaterialsNeeded $buildingMaterial required")
    }

}
//generic functions
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("\nSmall building")
    else println("\nlarge building")
}


fun main() {
    val building = Building<Wood>(Wood())
    building.build()
    isSmallBuilding(Building(Brick()))
}
