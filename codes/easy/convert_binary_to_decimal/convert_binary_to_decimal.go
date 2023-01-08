/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func findPower(num int, power int) int {
	result := 1

	if power == 0 {
		return 1
	}

	for power > 0 {
		result *= num
		power--
	}

	return result
}

func getDecimalValue(head *ListNode) int {
	sum := 0
	power := 0
	length := 0
	pCurrent := head

	for pCurrent != nil {
		length++
		pCurrent = pCurrent.Next
	}

	for head != nil {
		if head.Val == 1 {
			sum += findPower(2, length-1)
		}
		power++
		head = head.Next
		length--
	}

	return sum
}