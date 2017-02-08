package mapview.mailrutest.nitrobubbles.com.mapviewexample.ui.views.mapview

import mapview.mailrutest.nitrobubbles.com.mapviewexample.ui.BasePresenter

/**
 * Created by konstantinaksenov on 08.02.17.
 */
class MapViewPresenter : BasePresenter<MapViewContract.View>(), MapViewContract.Presenter {
    private var pressedStartPosition : Pair<Int, Int>? = null
    override fun actionUp(x: Int, y: Int) {
        pressedStartPosition = null
    }

    override fun actionMove(x: Int, y: Int) {
        pressedStartPosition?.let {
            view?.shiftView(x - it.first, y - it.second)
        }
        pressedStartPosition = Pair(x, y)
    }

    override fun actionDown(x: Int, y: Int) {
        pressedStartPosition = Pair(x, y)
    }


}