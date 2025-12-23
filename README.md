# DOFUS BOT
Dofus is a French 2D MMO turn based flash game. It has a heavy focus on economy and automated bots can easily generate in game currency due to the static nature of the game.
The project consists of multiple bot such as battling monsters, creating objects in large quantities and collecting ressources.

## Functionality
The bots use the SikuliX Java library to recognize images/objects on-screen.
Actions not based on image recognition are defined in pixels.
SikuliX detects objects pixel wise so screen resolution is of importance!
Necessary resolution is 1280x800.

Bots are coded with a focus on stability above speed to avoid getting stuck due to a server latency

## Use cases / Bots

- Object crafting:
  - Triste Lame
  - Lame de chafer
  - Hache Terophyle
  - Baton Dakn
  - Baguette Sylvien
  - Arc Ecologique
  - Polish minerals
  - PDA
  - potion Rappel
  - potion Bonta
  - potion Brakmar
  - potion Vieilesse

- Recolting resources:
  - Rice

- Combat bots:
  - Sadi fourbe chemin de fer
  - Donjon Morose (bugged atm)
  - Abraglands for 5 different maps

## Set-up

The bots are coded for a ** specific user related house location **. 
In case you want to reuse the codebase general access and travel functions need to be adapted accordingly
If you have no seperate PC to dedicate to the bot make use of a Virtual machine.

All code is created and used through Intellij Community Edition

Install Oracle OpenJDK 18.0.2 and set it as SDK to enable Sikuli

### Screen-resolution
Images and pixel locations are based on a resolution of **1280x800**
Terminal command for adjusting Virtualbox VM to necessary reslotion: **vboxmanage controlvm "MSEdge - Win10" setvideomodehint "1280" "800" "32”**

### User specific properties
User specific properties are set in the config.properties file
- House code
- Chest code

## Potential Feature list

- Relative pixel locations for clicking based on screen resolution: Click(x/xreslotion, y/yresolution)
- Add user specific variables to config.properties
- Add delta time to clicks to avoid being detected and banned (never happenned but better safe than sorry)
- Dynamic max crafts resource pick-up: Calculate max crafts and # resources to pick up based on characters max weight.
- Autopilot movement between maps based on start and end location (HARD)
- Handle other players interacting with you during botting and get stuck (cancel exchange etc)
- Visualize most profitable crafts based on shop actual resource prices (Current using excel)

## Known issues

- Mac retina displays have a 2:1 pixel ratio. All static defined pixel locations need to be multiplied x2 and images will not be detected. We advise not to use Retina screens

## Disclaimer 

Botting is not allowed in Dofus and are actively being detected and banned. 
Until this date these scripts have never been detected but it is strongly advised to not use on main account
