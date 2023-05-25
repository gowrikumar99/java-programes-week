#######################################
#   Configuration for Run Button      #
#######################################

# Provide the name of the directory (assignment or project name
cd week-3/day-13

# Java compile command. Do not change this. 
javac Break.java

#This is the main class you want to run. 
#This needs to change every time you want to run a #Java File. 
java Break



#######################################
#   Configuration for GitHub          #
#######################################
# This is a ONE TIME SETUP ONLY
# Configure these variables
EMAIL="dukkagowrikumar99@gmail.com"
NAME="gowrikumar"
GITHUB_USERNAME="gowrikumar99"
GITHUB_ACCESS_TOKEN="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"

#######################################
#   DO NOT CHANGE ANYTHING BELOW      #
#######################################

#git configuration below make using IDE easy.
git config --global --replace-all user.email $EMAIL
#enter your name
git config --global --replace-all user.name $NAME

#create ~/.netrc file
# This .netrc file is used to store your username and your Perosnal Access Token
FILE1=~/.netrc
if test -f "$FILE1"; then
    rm $FILE1
fi

echo machine github.com login $GITHUB_USERNAME password $GITHUB_ACCESS_TOKEN  > $FILE1




