Follow these steps to view the app:
1) Start by installing NodeJS:
https://nodejs.org/dist/v10.15.3/node-v10.15.3-x64.msi

2) While on the oblivio folder, open a command prompt/powershell and type:
	       npm install
This will read the package.json and install all the dependencies being used on the project. This will generate a node_modules folder and a file called package-lock.json. Neither one needs to be committed due to their size.

3) Once that completes, type:
	      npm start
and this will open your default web browser showing you the React app. As you hit save on any of the *.js files in the src folder the web browser will refresh to display the changes.

Happy Hacking!