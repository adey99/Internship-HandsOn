while read line
do
    case "$line" in
        (*Male)
            printf '%s\n' "$line" >> male_nominee.txt
            ;;
        (*Female)
            printf '%s\n' "$line" >> female_nominee.txt
            ;;
    esac
done < names.txt