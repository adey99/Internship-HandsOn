#!/bin/bash
f="$1"
for f in ${*}
do
    if [ ! -e $f ]
    then
        echo "File does not Exist" && exit
    elif [ -e $f ]
    then
        echo "File Exists!"
        if [ -r $f ] && [ -w $f ]
        then
            chmod a=rwx $f && echo "File Permission has been changed"
        fi
    fi
done