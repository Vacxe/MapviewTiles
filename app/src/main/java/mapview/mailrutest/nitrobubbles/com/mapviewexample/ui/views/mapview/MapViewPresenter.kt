package mapview.mailrutest.nitrobubbles.com.mapviewexample.ui.views.mapview

import mapview.mailrutest.nitrobubbles.com.mapviewexample.ui.BasePresenter

/**
 * Created by konstantinaksenov on 08.02.17.
 */
class MapViewPresenter : BasePresenter<MapViewContract.View>(), MapViewContract.Presenter {
    private var pressedStartPosition : Pair<Int, Int>? = null
    private var needUpdateTiles = false
    override fun actionUp(x: Int, y: Int) {
        pressedStartPosition = null
        if(needUpdateTiles) {
            view?.updateTiles()
            needUpdateTiles = false
        }
    }

    override fun actionMove(x: Int, y: Int) {
        pressedStartPosition?.let {
            view?.shiftTiles(x - it.first, y - it.second)
        }
        pressedStartPosition = Pair(x, y)
    }

    override fun actionDown(x: Int, y: Int) {
        pressedStartPosition = Pair(x, y)
    }

    override fun viewObtainSizes() {
        view?.updateTiles()
    }

    override fun requestUpdate() {
       needUpdateTiles = true
    }
}