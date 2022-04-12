package UnoStack


import UnoCards.cardBaseImp.Card
import UnoStack.stackBaseImp.Stack


trait StackInterface:
  def stackCards: List[Card]
  def initStack(): Stack
  def shuffleCards(): Stack
  def removeCard(): Stack
  def pullCards(playerStack: List[Card]): Stack
  def reversePullCards(playerStack: List[Card]): Stack
  def getCardFromStack(): Card
