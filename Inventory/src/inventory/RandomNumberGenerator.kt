package inventory

import kotlin.math.abs
import kotlin.random.Random

class RandomNumberGenerator {
    var minimumValue:Int = abs(Random.nextInt(5)+1)
    var maximumValue:Int = abs(Random.nextInt(11))
}
