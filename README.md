# UNO

![Logo](src/main/Pics/UNO-Logo.png)<br/>
<br/>
<br/>
The classic Uno-Game in a new Version, created in Scala. <br/> 
A project for the course Sofware-Engineering.  <br/>**
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
call to early "UNO!", that player must also draw to new cards<br/>
To wining the game the player with only one card must call "UNO!" again. <br/>

## Action Cards
**Reverse:** If going clockwise, switch to counterclockwise. It can only be played on a card that matches by color, or on another Reverse card.<br/><br/>
**Skip:** When a player places this card, the next player has to skip their turn. It can only be played on a card that matches by color, <br/>
or on another Skip card.<br/><br/>
**Draw Two:** When a person places this card, the next player will have to pick up two cards and forfeit his/her turn. It can only be played on<br/>
a card that matches by color, or on another Draw Two.<br/><br/>
**Wild:** This card represents all four colors, and can be placed on any card. The player has to state which color it will represent.<br/><br/>
**Wild - Draw Four:** This acts just like the wild card except that the next player also has to draw four cards.<br/><br/>

## GameField
To Enter the Game click on "Enter". If you want to close the window click on "Exit".<br/>
<img src="src/main/Pics/GameField1.PNG" width="500">
<br/><br/>
If you are on turn, your cards are invisible. Click on the "show cards" Button, to make your cards visible.
<img src="src/main/Pics/GameField2.PNG" width="600"> 
<img src="src/main/Pics/GameField3.PNG" width="600">

[![Build Status](https://travis-ci.com/konstantinz001/UNO.svg?branch=master)](https://travis-ci.com/konstantinz001/UNO)
[![Coverage Status](https://coveralls.io/repos/github/konstantinz001/UNO/badge.svg?branch=master)](https://coveralls.io/github/konstantinz001/UNO?branch=master)


