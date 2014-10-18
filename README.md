coding_day
==========

See if you guys can clone the repo, add a file your_name.txt with a description of what you want to learn when we meet on October 18th.

command line tips
===============
pwd				# show the path of the current directory
git clone <url to the repo>	# clone a git repo
git hist			# shows the history of the git repo
git pull			# fetches all updates to the repo and updates the HEAD to the tip of the current branch
git fetch -a			# fetches all updates to the repo without adjusting the HEAD
git br				# list the branches
git br -d branch-name		# delete a fully merged branch
git br -D branch-name		# delete a branch, do it I say!
git add file-name		# add a file in the current directory
git add /path/to/file/file-name	# add a file in the specified directory
git add .			# add everything in the current directory
git add :/			# add all files in the repo
git ci -m "[BRANCH-NAME]	# commit changes to the 
git co branch-name		# move the HEAD to an existing branch
git co -b branch-name		# create a new branch at the current HEAD
git push origin branch-name	# push the changes upstream (to gitHub)
git rebase other-branch-name	# move the current branch to the tip of the other-branch-name (sometimes conflicts will prevent this from working)
cd /path/to/the/repo		# change directory to a path
cd ..				# change directory up one level
ls				# list the files in the current directory
ls -a				# list files including hidden files in the current directory
vi file-name			# open the given file if it exists, open a new file of that name if it doesn't exist

vi commands
===========
i		# switch to insert mode (pretty much no hot keys work in insert mode)
esc		# get out of insert mode
:q		# quit
:w		# save (write)
:wq		# save and quit
:q!		# quit and don't save changes
dd		# delete a line
ctl+d		# down a half page
ctl+u		# up a half page
u		# undo

