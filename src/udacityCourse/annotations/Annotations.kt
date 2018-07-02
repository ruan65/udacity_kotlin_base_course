package udacityCourse.annotations

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

@ImAPlant class Plant {
    fun trim() {}
    fun fertilize() {}
}

annotation class ImAPlant

fun reflections() {

    val classObj: KClass<Plant> = Plant::class

    for (method: KFunction<*> in classObj.declaredMemberFunctions) {
        println(method.name)
    }

    for (annotation: Annotation in classObj.annotations) {
        println(annotation)
    }

    val annotated = classObj.findAnnotation<ImAPlant>()

    println(annotated)
}

fun main(args: Array<String>) {
    reflections()
}