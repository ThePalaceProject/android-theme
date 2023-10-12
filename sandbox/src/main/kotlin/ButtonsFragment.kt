package org.thepalaceproject.theme.sandbox

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class ButtonsFragment : Fragment(R.layout.buttons) {

  private lateinit var buttons: List<Button>
  private lateinit var toggle: Button

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    this.buttons = listOf<Button>(
      view.findViewById(R.id.containedSmall),
      view.findViewById(R.id.containedSmallIconL),
      view.findViewById(R.id.containedSmallIconR),
      view.findViewById(R.id.containedMedium),
      view.findViewById(R.id.containedMediumIconL),
      view.findViewById(R.id.containedMediumIconR),
      view.findViewById(R.id.containedLarge),
      view.findViewById(R.id.containedLargeIconL),
      view.findViewById(R.id.containedLargeIconR),

      view.findViewById(R.id.outlinedSmall),
      view.findViewById(R.id.outlinedSmallIconL),
      view.findViewById(R.id.outlinedSmallIconR),
      view.findViewById(R.id.outlinedMedium),
      view.findViewById(R.id.outlinedMediumIconL),
      view.findViewById(R.id.outlinedMediumIconR),
      view.findViewById(R.id.outlinedLarge),
      view.findViewById(R.id.outlinedLargeIconL),
      view.findViewById(R.id.outlinedLargeIconR),

      view.findViewById(R.id.textSmall),
      view.findViewById(R.id.textSmallIconL),
      view.findViewById(R.id.textSmallIconR),
      view.findViewById(R.id.textMedium),
      view.findViewById(R.id.textMediumIconL),
      view.findViewById(R.id.textMediumIconR),
      view.findViewById(R.id.textLarge),
      view.findViewById(R.id.textLargeIconL),
      view.findViewById(R.id.textLargeIconR),
    )

    this.toggle = view.findViewById(R.id.toggleEnable)
  }

  override fun onStart() {
    super.onStart()

    this.buttons.forEach {
      it.setOnClickListener(this::onButtonClick)
    }

    this.toggle.setOnClickListener(this::onToggle)
  }

  private fun onToggle(view: View?) {
    this.buttons.forEach {
      it.isEnabled = !it.isEnabled
    }
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
