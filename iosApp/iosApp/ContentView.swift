import SwiftUI
import shared

var diceRoller: DiceRoller = DiceRoller()

private func rollDice() {
    diceRoller.rollDice()
}

private func setDiceText() -> String {
    String(diceRoller.getDiceNumber())
}

struct ContentView: View {
    @State var diceText: String = ""
    var body: some View {
        Text(diceText)
        Button("Roll the dice") {
            rollDice()
            diceText = setDiceText()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
