def binary_search(sorted_list,item):
    '''guess the element in a sorted list

    Parameters：
        sorted_list: the sorted list
        item: correct element
        low<int>: lowest number of the list
        middle<int>
        High<int>

    Return:
        the guess value (int)
    '''
    low = 0
    high = len(sorted_list)-1

    while low <= high:
        mid = (low + high)//2
        guess = sorted_list[mid]
        if guess == item:
            return mid
        # guess was too high
        if guess>item:
            high = mid - 1
        # guess was too low
        else:
            low = mid + 1
    return None

    return guess







def main():
    sorted_list = [1,3,5,7,9]
    print(binary_search(sorted_list, -1))



if __name__ == "__main__":
    main()
