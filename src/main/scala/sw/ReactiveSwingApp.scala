package sw

import scala.swing.event.ButtonClicked
import scala.swing.{BoxPanel, Button, Label, MainFrame, Orientation, SimpleSwingApplication, Swing}

object ReactiveSwingApp extends SimpleSwingApplication{
  def top = new MainFrame(){
    title ="second Swing App"
    val button = new Button{
      text = "Click me"
    }
    val label = new Label{
      text = "No button clicks registered"
    }
    contents = new BoxPanel(Orientation.Vertical){
      contents += button
      contents +=label
      border = Swing.EmptyBorder(30,30,10,30)
    }
    listenTo(button)
    var nClicks = 0
    reactions += {
      case ButtonClicked(b) =>
        nClicks +=1
        label.text = "Number of button clicks: " + nClicks
    }
  }
}
