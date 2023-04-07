func checkIfPangram(sentence string) bool {
	charMap := make(map[byte]bool)

	for _, char := range sentence {
		charMap[byte(char)] = true
	}

	return len(charMap) == 26
}