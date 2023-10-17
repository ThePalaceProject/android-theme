package org.thepalaceproject.theme.sandbox

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import org.thepalaceproject.theme.core.PalaceTabButtons

class TabbedButtonsFragment : Fragment(R.layout.tabbed_buttons) {

  private lateinit var group0: RadioGroup
  private lateinit var group1: RadioGroup
  private lateinit var group2: RadioGroup

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    this.group0 = view.findViewById(R.id.tabbedButtons0)
    this.group1 = view.findViewById(R.id.tabbedButtons1)
    this.group2 = view.findViewById(R.id.tabbedButtons2)

    PalaceTabButtons.configureGroup(this.requireContext(), this.group0, 5) { id, button ->
      button.text = "Button $id"
      if (id == 3) {
        button.isEnabled = false
      }
    }

    PalaceTabButtons.configureGroup(this.requireContext(), this.group1, 3) { id, button ->
      button.text = "Button $id"
      if (id == 2) {
        button.isEnabled = false
      }
    }

    PalaceTabButtons.configureGroup(this.requireContext(), this.group2, 3) { id, button ->
      button.text = "Button $id"
      if (id == 0) {
        button.isEnabled = false
      }
    }
  }
}
