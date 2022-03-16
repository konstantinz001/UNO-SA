# UNO

![Logo](src/main/Pics/UNO-Logo.png)<br/>
<br/>
<br/>
The classic Uno-Game in a new Version, created in Scala. <br/> 
A project for the course Software Architecture.  <br/>**
By **Konstantin Zabaznov** and **Soniesen Ratnaingam**.<br/>

## Setup
The game is for 2 player. The Draw Pile contains 108 cards. Each player takes seven cards form the Draw Pile.<br/> 
The top card from the Draw Pile will be placed in the Discard Pile, and the game begins!<br/> 

## Game Play
You have to match either by the number, color, or the symbol/Action with the  Discard Pile. For example, <br/>
if the Discard Pile has a red card with the number 8 you have to place either a red card or a card with an 8 on it. <br/>
You can also play a Wild card (which can alter current color in play).<br/>
<br/>
If the player has no matches or they choose not to play any of their cards even though they might have a match, <br/>
they must draw a card from the Draw pile.<br/>
<br/>
If a player put a Card on the Discard Pile or take a card from the Draw Pile, the game moves on to the next person in turn. <br/>
You can also play a Wild card, or a Wild Draw Four card on your turn.<br/>

The game continues until a player has two card left. The moment a player has just two card they must call “UNO!” to put <br/>
another card on the Discard Pile. If they are not calling “Uno”, that player must draw two new cards as a penalty. If a player  <br/>
call to early "UNO!", that player must also draw two new cards<br/>
To wining the game the player with only one card must call "UNO!" again. <br/>

## Action Cards
* **Reverse:** If going clockwise, switch to counterclockwise. It can only be played on a card that matches by color, or on another Reverse card.<br/><br/>
* **Skip:** When a player places this card, the next player has to skip their turn. It can only be played on a card that matches by color, <br/>
or on another Skip card.<br/><br/>
* **Draw Two:** When a person places this card, the next player will have to pick up two cards and forfeit his/her turn. It can only be played on<br/>
a card that matches by color, or on another Draw Two.<br/><br/>
* **Wild:** This card represents all four colors, and can be placed on any card. The player has to state which color it will represent.<br/><br/>
* **Wild - Draw Four:** This acts just like the wild card except that the next player also has to draw four cards.<br/><br/>

## The Game
<img src="src/main/Pics/GameField3.PNG"><br/>
### Graphical UI
To Enter the Game click on "Enter". If you want to close the window click on "Exit".<br/>
<img src="src/main/Pics/GameField1.PNG" width="500">
<br/><br/>
If you are on turn, your cards are invisible. Click on the "show cards" Button on the right site, to make your cards visible.<br/>
If you want to draw a card from the Draw Pile, you have to click the Draw Pile Button on the left site.<br/>
<img src="src/main/Pics/GameField2.PNG" width="500"> 
<img src="src/main/Pics/GameField3.PNG" width="500">
<br/><br/>
If you want to set a "Wild" Card, you have choose a wishcolor. click one of Color Buttons to set your wishcolor.<br/>
<img src="src/main/Pics/GameField5.PNG" width="500"> <br/>
<br/><br/>
If you have only one or two cards and you want to put a card on the Discard Pile, you have to click on the UNO-Button to call "UNO!".<br/>
<img src="src/main/Pics/GameField4.PNG" width="500"> <br/>
<br/><br/>
If the game is over, you can play another game with the "yes" Button or close the window with the "no" Button.<br/>
<img src="src/main/Pics/GameField6.PNG" width="500"> 
<br/><br/>
### Technical UI
You can write various instructions to play with the TUI.
<br/>
* **Remove a card from your hand:** r [index] [Optional: WishColor]
* **Get a card from the Draw Pile:** s
* **Remove a card from your hand and call UNO:** u [index]
* **Exit Game:** q
* **Make Undo:** undo
* **Make Redo:** redo
* **Save Game:** save
* **Load Game:** load
<br/><br/><br/><br/><br/>
`INFO:`To clone the repository and play you have to set the enviroment variable. <br/>
Use UI_TYPE=tui to play only with TUI. Use UI_TYPE=gui to play with GUI and TUI.
<img src="src/main/Pics/Env.PNG" width="1000"> 


### Coverage with GUI-Components
[![Build Status](https://travis-ci.com/konstantinz001/UNO.svg?branch=TestCoverage_GUI)](https://travis-ci.com/konstantinz001/UNO)
[![Coverage Status](https://coveralls.io/repos/github/konstantinz001/UNO/badge.svg?branch=TestCoverage_GUI)](https://coveralls.io/github/konstantinz001/UNO?branch=TestCoverage_GUI)

### Coverage without GUI-Components
[![Build Status](https://travis-ci.com/konstantinz001/UNO.svg?branch=TestCoverage_TUI)](https://travis-ci.com/konstantinz001/UNO)
[![Coverage Status](https://coveralls.io/repos/github/konstantinz001/UNO/badge.svg?branch=TestCoverage_TUI)](https://coveralls.io/github/konstantinz001/UNO?branch=TestCoverage_TUI)
