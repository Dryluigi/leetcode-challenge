func numJewelsInStones(jewels string, stones string) int {
	result := 0

	for _, stone := range stones {
		found := false

		for _, jewel := range jewels {
			if stone == jewel {
				result += 1
				found = true
			}

			if found {
				break
			}
		}
	}

	return result
}