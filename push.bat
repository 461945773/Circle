set d=%date:~0,10%
set t=%time:~0,8%
git add -A
git commit -m "%d% %t%"
git push origin master