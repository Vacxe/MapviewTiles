package mapview.mailrutest.nitrobubbles.com.mapviewexample.ui.views.mapview

/**
 * Created by konstantinaksenov on 08.02.17.
 */
interface MapViewContract{
    interface View{
        fun shiftTiles(x : Int, y :Int)
        fun updateTiles()
    }
    interface Presenter{
        fun viewObtainSizes()
        fun requestUpdate()
        fun actionDown(x : Int, y :Int)
        fun actionUp(x : Int, y :Int)
        fun actionMove(x : Int, y :Int)
    }
}