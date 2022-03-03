package com.example.mapintegration.model

class MapData {
    var routes = ArrayList<Routes>()
}

class Routes {
    var legs = ArrayList<Legs>()
}

class Legs {
    var steps = ArrayList<Steps>()
}

class Steps {
    var polyline = PolyLine()
}

class PolyLine {
    var points = ""
}