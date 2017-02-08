package mapview.mailrutest.nitrobubbles.com.mapviewexample.ui

/**
 * Created by konstantinaksenov on 08.02.17.
 */
abstract class BasePresenter<T>{
    var view: T? = null

    fun bindView(view : T){
        this.view = view
    }

    fun unbindView(){
        this.view = null
    }

}