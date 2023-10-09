package org.thepalaceproject.theme.sandbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class SandboxActivity : AppCompatActivity(R.layout.sandbox) {

  private lateinit var bottomNavigationView: BottomNavigationView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val buttonsOutlinedFragment =
      ButtonsOutlinedFragment()
    val buttonsContainedFragment =
      ButtonsContainedFragment()
    val buttonsTextFragment =
      ButtonsTextFragment()
    val otherFragment =
      OtherFragment()
    val tabsFragment =
      TabsFragment()

    if (savedInstanceState == null) {
      val fragmentTransaction: FragmentTransaction = this.supportFragmentManager.beginTransaction()
      fragmentTransaction.replace(R.id.sandboxFragmentContainer, buttonsContainedFragment).commit()
    }

    this.bottomNavigationView =
      this.findViewById(R.id.sandboxBottomNavigation)

    this.bottomNavigationView.setOnItemSelectedListener { item ->
      val fragmentManager: FragmentManager = this.supportFragmentManager
      return@setOnItemSelectedListener when (item.itemId) {
        R.id.navButtonsOutlined -> {
          val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
          fragmentTransaction.replace(R.id.sandboxFragmentContainer, buttonsOutlinedFragment).commit()
          true
        }
        R.id.navButtonsContained -> {
          val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
          fragmentTransaction.replace(R.id.sandboxFragmentContainer, buttonsContainedFragment).commit()
          true
        }
        R.id.navButtonsText -> {
          val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
          fragmentTransaction.replace(R.id.sandboxFragmentContainer, buttonsTextFragment).commit()
          true
        }
        R.id.navOther -> {
          val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
          fragmentTransaction.replace(R.id.sandboxFragmentContainer, otherFragment).commit()
          true
        }
        R.id.navTabs -> {
          val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
          fragmentTransaction.replace(R.id.sandboxFragmentContainer, tabsFragment).commit()
          true
        }
        else -> {
          true
        }
      }
    }
  }
}
