package org.thepalaceproject.theme.sandbox

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class ButtonsContainedFragment : Fragment(R.layout.buttons_contained) {

  private lateinit var b0: Button
  private lateinit var b1: Button
  private lateinit var b2: Button
  private lateinit var b3: Button
  private lateinit var b4: Button
  private lateinit var b5: Button
  private lateinit var b6: Button
  private lateinit var b7: Button
  private lateinit var b8: Button

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    this.b0 = view.findViewById(R.id.containedSmall)
    this.b1 = view.findViewById(R.id.containedSmallIconL)
    this.b2 = view.findViewById(R.id.containedSmallIconR)
    this.b3 = view.findViewById(R.id.containedMedium)
    this.b4 = view.findViewById(R.id.containedMediumIconL)
    this.b5 = view.findViewById(R.id.containedMediumIconR)
    this.b6 = view.findViewById(R.id.containedLarge)
    this.b7 = view.findViewById(R.id.containedLargeIconL)
    this.b8 = view.findViewById(R.id.containedLargeIconR)
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
