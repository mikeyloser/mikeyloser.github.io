def sum3s(low, high):
  total = 0
  while low <= high:
    if low % 3 == 0:
      total += low
    low += 1
  return total
