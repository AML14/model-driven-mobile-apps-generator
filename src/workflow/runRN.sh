#!/bin/bash

osascript -e 'tell app "Terminal"
    do script "rm /Users/Alberto/Desktop/AppTemplate/index.js; rm -rf /Users/Alberto/Desktop/AppTemplate/App; cp /Users/Alberto/workspace/Eclipse-Epsilon/model-driven-mobile-apps-generator/src-gen/index.js /Users/Alberto/Desktop/AppTemplate/index.js; cp -R /Users/Alberto/workspace/Eclipse-Epsilon/model-driven-mobile-apps-generator/src-gen/App /Users/Alberto/Desktop/AppTemplate/App; cd /Users/Alberto/Desktop/AppTemplate; . ~/.nvm/nvm.sh; nvm use 6.1.0; react-native run-ios;"
end tell'