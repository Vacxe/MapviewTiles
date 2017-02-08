package mapview.mailrutest.nitrobubbles.com.mapviewexample.ui.views.mapview

/**
 * Created by konstantinaksenov on 08.02.17.
 */
interface MapViewContract{
    interface View{
        fun shiftView(x : Int, y :Int)
    }
    interface Presenter{
        fun actionDown(x : Int, y :Int)
        fun actionUp(x : Int, y :Int)
        fun actionMove(x : Int, y :Int)
    }
}