package org.thepalaceproject.theme.sandbox

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class ButtonsOutlinedFragment : Fragment(R.layout.buttons_outlined) {
  private lateinit var b0: Button
  private lateinit var b1: Button
  private lateinit var b2: Button
  private lateinit var b3: Button
  private lateinit var b4: Button
  private lateinit var b5: Button
  private lateinit var b6: Button
  private lateinit var b7: Button
  private lateinit var b8: Button
  private lateinit var toggle: Button

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    this.b0 = view.findViewById(R.id.outlinedSmall)
    this.b1 = view.findViewById(R.id.outlinedSmallIconL)
    this.b2 = view.findViewById(R.id.outlinedSmallIconR)
    this.b3 = view.findViewById(R.id.outlinedMedium)
    this.b4 = view.findViewById(R.id.outlinedMediumIconL)
    this.b5 = view.findViewById(R.id.outlinedMediumIconR)
    this.b6 = view.findViewById(R.id.outlinedLarge)
    this.b7 = view.findViewById(R.id.outlinedLargeIconL)
    this.b8 = view.findViewById(R.id.outlinedLargeIconR)
    this.toggle = view.findViewById(R.id.toggleEnable)
  }

  override fun onStart() {
    super.onStart()

    this.b0.setOnClickListener(this::onButtonClick)
    this.b1.setOnClickListener(this::onButtonClick)
    this.b2.setOnClickListener(this::onButtonClick)
    this.b3.setOnClickListener(this::onButtonClick)
    this.b4.setOnClickListener(this::onButtonClick)
    this.b5.setOnClickListener(this::onButtonClick)
    this.b6.setOnClickListener(this::onButtonClick)
    this.b7.setOnClickListener(this::onButtonClick)
    this.b8.setOnClickListener(this::onButtonClick)

    this.toggle.setOnClickListener(this::onToggle)
  }

  private fun onToggle(view: View?) {
    this.b0.isEnabled = !this.b0.isEnabled
    this.b1.isEnabled = !this.b1.isEnabled
    this.b2.isEnabled = !this.b2.isEnabled
    this.b3.isEnabled = !this.b3.isEnabled
    this.b4.isEnabled = !this.b4.isEnabled
    this.b5.isEnabled = !this.b5.isEnabled
    this.b6.isEnabled = !this.b6.isEnabled
    this.b7.isEnabled = !this.b7.isEnabled
    this.b8.isEnabled = !this.b8.isEnabled
  }

  private fun onButtonClick(view: View?) {
    if (view == null) {
      return
    }

    MaterialAlertDialogBuilder(view.context)
      .setTitle("Hello!")
      .setMessage("You rang?")
      .setNegativeButton("No!") { dialog, which ->
        dialog.dismiss()
      }
      .setPositiveButton("Yes!") { dialog, which ->
        dialog.dismiss()
      }
      .show()
  }
}
