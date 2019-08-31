package both.side.navigation.drawer.using.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.right_drawer_menu.*

class MainActivity : AppCompatActivity()
{
    private val favoriteList = ArrayList<String>()
    lateinit var adapter: FavoriteAdapter

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init favorite data
        favoriteList.add("Sport")
        favoriteList.add("Movie")
        favoriteList.add("Travelling")
        favoriteList.add("Reading")
        favoriteList.add("News")
        favoriteList.add("Marketing")
        favoriteList.add("Technology")
        favoriteList.add("Trending")

        // init adapter
        adapter = FavoriteAdapter(favoriteList)

        // init recyclerview
        rvFavorites.layoutManager = LinearLayoutManager(this)
        rvFavorites.adapter = adapter
        rvFavorites.isNestedScrollingEnabled = false

        // set on click listener to left navigation icon
        ivNavMenu.setOnClickListener{
            toggleLeftDrawer()
        }

        // set on click listener to right navigation icon
        ivFavoriteList.setOnClickListener{
            toggleRightDrawer()
        }
    }

    private fun toggleLeftDrawer()
    {
        if (drawerLayout.isDrawerOpen(leftDrawerMenu))
        {
            drawerLayout.closeDrawer(leftDrawerMenu)
        }
        else
        {
            drawerLayout.openDrawer(leftDrawerMenu)
        }
    }

    private fun toggleRightDrawer()
    {
        if (drawerLayout.isDrawerOpen(rightDrawerMenu))
        {
            drawerLayout.closeDrawer(rightDrawerMenu)
        }
        else
        {
            drawerLayout.openDrawer(rightDrawerMenu)
        }
    }
}
