package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(Math::sqrt).map(Double::intValue).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        Set<Integer> A = new TreeSet<>(users.stream().map(User::getAge).toList());
        return new ArrayList<>(A);
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        List<User> temp = users.stream().filter((u) -> u.getAge() > 25).toList();
        return temp.size();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().reduce(0, Integer::sum);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).toList();
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(s -> s.split(" ")[0]).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream().flatMap(s -> Arrays.stream(s.split(""))).distinct().collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).toList().toString().replace("[", "").replace("]", "");
    }

    public static double getAverageAge(List<User> users) {
        double sum = users.stream().map(User::getAge).reduce(0, Integer::sum);
        return sum / users.size();
    }

    public static Integer getMaxAge(List<User> users) {
        List<Integer> temp = new ArrayList<>(users.stream().map(User::getAge).sorted().toList());
        Collections.sort(temp);
        return temp.get(temp.size() - 1);
    }

    public static Integer getMinAge(List<User> users) {
        List<Integer> temp = new ArrayList<>(users.stream().map(User::getAge).sorted().toList());
        Collections.sort(temp);
        return temp.get(0);
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingByConcurrent(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(Collectors.groupingByConcurrent(User::isMale, Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().anyMatch(x -> x.getAge().equals(age));
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().noneMatch(x -> x.getAge().equals(age));
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(x -> x.getName().matches(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.rangeClosed(2, 29).filter(StreamsExercise::isPrime).boxed().toList();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return new Random().ints(10, 0, 100).boxed().toList();
    }

    public static User findOldest(List<User> users) {
        List<User> temp = users.stream().sorted(Comparator.comparingInt(User::getAge)).toList();
        return temp.get(temp.size() - 1);
    }

    public static int sumAge(List<User> users) {
        return users.stream().map(User::getAge).reduce(0, Integer::sum);
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().mapToInt(User::getAge).summaryStatistics();
    }
}
