func countMatches(items [][]string, ruleKey string, ruleValue string) int {
	var result, index int

	if ruleKey == "color" {
		index = 1
	} else if ruleKey == "name" {
		index = 2
	}

	for _, item := range items {
		if item[index] == ruleValue {
			result++
		}
	}

	return result
}