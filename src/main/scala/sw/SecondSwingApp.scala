package sw

import scala.swing.{BoxPanel, Button, Label, MainFrame, Orientation, SimpleSwingApplication, Swing}

object SecondSwingApp extends SimpleSwingApplication{
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
  }
}
