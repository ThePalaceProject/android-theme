package org.thepalaceproject.theme.core

import android.content.Context
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding

/**
 * Functions to configure tabbed buttons.
 */

object PalaceTabButtons {

  /**
   * Configure a radio group as a set of tabbed buttons.
   *
   * @param context The context
   * @param group The radio group
   * @param count The number of buttons
   * @param buttonConfigurator A function called for each button to configure it
   */

  fun configureGroup(
    context: Context,
    group: RadioGroup,
    count: Int,
    buttonConfigurator: (Int, Button) -> Unit
  ) {
    group.removeAllViews()

    for (index in 0 until count) {
      val button = RadioButton(context)
      val buttonLayout =
        LinearLayout.LayoutParams(
          0,
          ViewGroup.LayoutParams.MATCH_PARENT,
          1.0f / count.toFloat()
        )

      button.layoutParams = buttonLayout
      button.gravity = Gravity.CENTER
      button.maxLines = 1
      button.ellipsize = TextUtils.TruncateAt.END

      /*
       * The buttons need unique IDs so that they can be addressed within the parent
       * radio group.
       */

      button.id = View.generateViewId()

      if (index == 0) {
        button.setBackgroundResource(R.drawable.palace_tab_button_background_leftmost)
        button.setButtonDrawable(R.drawable.palace_tab_button_background_leftmost)
      } else if (index + 1 == count) {
        button.setBackgroundResource(R.drawable.palace_tab_button_background_rightmost)
        button.setButtonDrawable(R.drawable.palace_tab_button_background_rightmost)
      } else {
        button.setBackgroundResource(R.drawable.palace_tab_button_background)
        button.setButtonDrawable(R.drawable.palace_tab_button_background)
      }

      button.setPadding(0)
      button.setTextColor(ContextCompat.getColorStateList(context, R.color.palace_tab_button_text))
      buttonConfigurator(index, button)

      group.addView(button)
    }
  }
}
