import "strings"

func cellsInRange(s string) []string {
	result := make([]string, 0)

	for i := s[0]; i <= s[3]; i++ {
		for j := s[1]; j <= s[4]; j++ {
			var sb strings.Builder
			sb.WriteByte(i)
			sb.WriteByte(j)

			result = append(result, sb.String())
		}
	}

	return result
}