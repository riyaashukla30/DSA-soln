class Solution(object):
    def findMinimumTime(self, strength, k):

        n = len(strength)
        ans = [float('inf')]

        def solve(used, count, x, time):

            if count == n:
                ans[0] = min(ans[0], time)
                return

            for i in range(n):

                if not used[i]:

                    used[i] = True

                    # ceil(strength[i] / x)
                    need = (strength[i] + x - 1) // x

                    solve(
                        used,
                        count + 1,
                        x + k,
                        time + need
                    )

                    used[i] = False

        used = [False] * n
        solve(used, 0, 1, 0)

        return ans[0]