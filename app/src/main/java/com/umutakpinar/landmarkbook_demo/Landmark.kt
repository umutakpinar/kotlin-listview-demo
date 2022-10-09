package com.umutakpinar.landmarkbook_demo

class Landmark (landmarkName : String, landmarkCountry: String, image : Int) : java.io.Serializable{
    lateinit var landmarkName : String
    lateinit var landmarkCountry: String
    var image: Int = 0
    init{
        this.landmarkName = landmarkName
        this.landmarkCountry = landmarkCountry
        this.image = image
    }
}