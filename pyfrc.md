# Install PyFRC 2020

Do the following steps to get a working Python system installed. Most of these are one-time tasks. Tasks that need to be performed every time you log in are noted.

Type these into a terminal window so you get used to entering commands. Don't just copy/paste.

1. Install build tools and python "*virtual environment*"

    ```sudo apt install build-essential python3-dev python3.7-dev virtualenv python3-virtualenv```

1. Create a new folder for pyfrc in your ```${HOME}``` directory.

    ```mkdir -p ~/frc2020/pyfrc```

1. Change to that folder (you'll need to change here **every time you log in or open a new terminal window**)

    ```cd frc2020/pyfrc```

1. Establish a new *virtual environment* in the current folder

    ```virtualenv --python=python3 --download .```

1. Activate the new *virtual environment* (you'll need to activate **every time you log in or open a new terminal window**)

    ```source ./bin/activate```

1. Add the *virtual environment* to your shell's search path (you'll need to add this **every time you log in or open a new terminal window**)

    ```export PATH=$PWD/bin:$PATH```
	
1. Clone the Seamonsters, Team 2605 2020 git repo

    ```git clone https://github.com/Seamonsters-2605/CompetitionBot2020.git```

    ```git log``` (*optional*: to see the commit history of this repo)

1. Install the *pyfrc* tools

    ```pip install pyfrc```

    and wait a good long while for everything to install; ```wpilib``` takes the longest

1. Install additional robotpy tools and packages

    ```pip install robotpy-rev robotpy-rev-color robotpy-navx remi```

1. Update your local clone of the Seamonster's repo (you'll want to **do this at least every couple of days to keep up with their development**)

    ```cd ~/frc2020/pyfrc/CompetitionBot2020 ; git pull```
	
1. Run the simulation

	```cd ~/frc2020/pyfrc/Competitionbot2020```

    ```python ./robot.py sim```
