package cs2.adt

class ArrayStack[A : Manifest] extends Stack[A] {
    var arr:Array[A] = new Array[A] (10)
    var len:Int = 0

    def push(elem:A):Unit = {
        if(len == arr.length) {
            val tmp:Array[A] = new Array[A] (arr.length * 2)
            for(i <- 0 until arr.length) {
                tmp(i) = arr(i)
            }
            arr = tmp
        }
        arr(len) = elem
        len += 1
    }
    def pop():A = {
        len -= 1
        arr(len)
    }
    def peek():A = {
        arr(len - 1)
    }
    def isEmpty():Boolean = {
        len == 0
    }
}